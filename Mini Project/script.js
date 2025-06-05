// Canvas Setup
const canvas = document.getElementById("canvas");
const ctx = canvas.getContext("2d");
const runBtn = document.getElementById("runBtn");
const resetBtn = document.getElementById("resetBtn");
const kInput = document.getElementById("kValue");

let points = [];
let centroids = [];
let clusters = [];
let colors = ["#FF6B6B", "#4ECDC4", "#45B7D1", "#FFA07A", "#98D8C8"];

// Draw a point
function drawPoint(x, y, color = "#333", radius = 5) {
    ctx.beginPath();
    ctx.arc(x, y, radius, 0, Math.PI * 2);
    ctx.fillStyle = color;
    ctx.fill();
}

// Initialize random centroids
function initCentroids(k) {
    centroids = [];
    for (let i = 0; i < k; i++) {
        const x = Math.random() * canvas.width;
        const y = Math.random() * canvas.height;
        centroids.push({ x, y });
    }
}

// Assign points to nearest centroid
function assignClusters() {
    clusters = Array(centroids.length).fill().map(() => []);
    points.forEach(point => {
        let minDist = Infinity;
        let clusterIndex = 0;
        centroids.forEach((centroid, i) => {
            const dist = Math.sqrt((point.x - centroid.x) ** 2 + (point.y - centroid.y) ** 2);
            if (dist < minDist) {
                minDist = dist;
                clusterIndex = i;
            }
        });
        clusters[clusterIndex].push(point);
    });
}

// Update centroids to cluster mean
function updateCentroids() {
    centroids.forEach((centroid, i) => {
        if (clusters[i].length === 0) return;
        const sumX = clusters[i].reduce((acc, p) => acc + p.x, 0);
        const sumY = clusters[i].reduce((acc, p) => acc + p.y, 0);
        centroid.x = sumX / clusters[i].length;
        centroid.y = sumY / clusters[i].length;
    });
}

// Visualize clusters
function visualize() {
    ctx.clearRect(0, 0, canvas.width, canvas.height);
    // Draw points
    points.forEach(point => {
        let minDist = Infinity;
        let clusterIndex = 0;
        centroids.forEach((centroid, i) => {
            const dist = Math.sqrt((point.x - centroid.x) ** 2 + (point.y - centroid.y) ** 2);
            if (dist < minDist) {
                minDist = dist;
                clusterIndex = i;
            }
        });
        drawPoint(point.x, point.y, colors[clusterIndex]);
    });
    // Draw centroids
    centroids.forEach((centroid, i) => {
        drawPoint(centroid.x, centroid.y, colors[i], 8);
    });
}

// Run K-Means
function runKMeans() {
    const k = parseInt(kInput.value);
    if (points.length === 0) return alert("Add some points first!");
    initCentroids(k);
    let iterations = 0;
    const maxIterations = 10;
    const interval = setInterval(() => {
        assignClusters();
        updateCentroids();
        visualize();
        iterations++;
        if (iterations >= maxIterations) clearInterval(interval);
    }, 1000);
}

// Event Listeners
canvas.addEventListener("click", (e) => {
    const rect = canvas.getBoundingClientRect();
    const x = e.clientX - rect.left;
    const y = e.clientY - rect.top;
    points.push({ x, y });
    drawPoint(x, y);
});

runBtn.addEventListener("click", runKMeans);
resetBtn.addEventListener("click", () => {
    points = [];
    centroids = [];
    ctx.clearRect(0, 0, canvas.width, canvas.height);
});