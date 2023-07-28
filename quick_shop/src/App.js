// Import the CSS styles from the "App.css" file
import "./App.css";
import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import { Navbar } from "./components/navbar";  

// Define the main App component
function App() {
  // Create a parent container div with the class "App" for styling purposes
  return (
    <div className="App">
      <ShopContextProvider>
        <Router>
        <ToastContainer position="top-center" theme="colored" autoClose={2000} />
          <Navbar />
          <Routes>
            <Route path="/" element={<Shop />} />
            <Route path="/contact" element={<Contact />} />
            <Route path="/cart" element={<Cart />} />
            <Route path="/checkout" element={<Checkout />} />
          </Routes>
        </Router>
      </ShopContextProvider>
    </div>
  );
}

export default App;
