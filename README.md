🌦️ Mausam UI (Frontend)

The interactive user interface for the Mausam Weather System. Built with React and Vite, it provides a responsive and animated experience to check weather conditions and air quality.

🚀 Features

Responsive Design: Optimized for Mobile, Tablet, and Desktop screens using Tailwind CSS.

Real-time Data: Fetches live data from the Mausam Backend API.

Interactive Animations: Smooth transitions and loading states using Framer Motion.

Glassmorphism UI: Modern aesthetic with backdrop blurs and clean typography.

Error Handling: Graceful error messages for invalid cities or network issues.

🛠️ Tech Stack

Library: React.js (Vite)

Styling: Tailwind CSS

Animations: Framer Motion

HTTP Client: Axios

Deployment: Vercel

⚙️ Local Setup

1. Clone the Repository

git clone [https://github.com/YOUR_USERNAME/Mausam-Frontend.git](https://github.com/YOUR_USERNAME/Mausam-Frontend.git)
cd Mausam-Frontend


2. Install Dependencies

npm install


3. Configure Backend URL

Open src/services/api.js (or wherever your API call logic is) and ensure the Base URL points to your running backend:

// For local development
const BASE_URL = "http://localhost:8080";

// For production (Render)
// const BASE_URL = "[https://your-backend-app.onrender.com](https://your-backend-app.onrender.com)";


4. Run Development Server

npm run dev


The app will launch at http://localhost:5173.

☁️ Deployment (Vercel)

Push this repository to GitHub.

Import the project in Vercel.

Set the Root Directory to frontend (if the code is inside a subfolder).

Vercel will automatically detect Vite and deploy.

🤝 Credits

Backend Logic: Developed by Saksham.

UI Implementation: Assisted by AI, integrated and optimized by the developer.

Powered by Mausam API
