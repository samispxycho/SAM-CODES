import cv2
import numpy as np
import pygame
# Initialize Pygame mixer
pygame.mixer.init()

# Load the sound file
pygame.mixer.music.load('sound_file.mp3')

# Set the volume (optional)
pygame.mixer.music.set_volume(0.5)
pygame.mixer.pre_init(44100, 16, 2, 4096) #frequency, size, channels, buffersize
pygame.init() #turn all of pygame on.

# Define a flag to track movement detection
movement_detected = False

# Set up video capture
cap = cv2.VideoCapture(0)
ret, frame1 = cap.read()
ret, frame2 = cap.read()

while cap.isOpened():
    diff = cv2.absdiff(frame1, frame2)
    gray = cv2.cvtColor(diff, cv2.COLOR_BGR2GRAY)
    blur = cv2.GaussianBlur(gray, (5, 5), 0)
    _, thresh = cv2.threshold(blur, 20, 255, cv2.THRESH_BINARY)
    dilated = cv2.dilate(thresh, None, iterations=3)
    contours, _ = cv2.findContours(dilated, cv2.RETR_TREE, cv2.CHAIN_APPROX_SIMPLE)

    for contour in contours:
        (x, y, w, h) = cv2.boundingRect(contour)

        if cv2.contourArea(contour) < 500:
            continue

        cv2.rectangle(frame1, (x, y), (x + w, y + h), (0, 255, 0), 2)
        cv2.putText(frame1, "Status: Movement", (10, 20), cv2.FONT_HERSHEY_SIMPLEX, 1, (0, 0, 255), 3)
        movement_detected = True

    cv2.drawContours(frame1, contours, -1, (0, 255, 0), 2)

    cv2.imshow("Detector", frame1)
    frame1 = frame2
    ret, frame2 = cap.read()

    # Play sound if movement is detected
    if movement_detected:
        pygame.mixer.music.play()

    movement_detected = False

    if cv2.waitKey(40) == 27:
        break

cv2.destroyAllWindows()
cap.release()