import React, { useState, useEffect } from 'react';

// Import the styles for different buttons
import './Wishlist.css';

const Wishlist = () => {
  // Initialize state for the wishlist items
  const [wishlistItems, setWishlistItems] = useState([]);

  // Simulate fetching products from an API
  useEffect(() => {
    // Replace the following with your actual API endpoint
    const apiUrl = 'https://localhost:8080/wishlistItems/{userId}';
    // Simulated product data
    const sampleProducts = [];

    // Fetch products from the API (replace with actual fetch or Axios call)
     fetch(apiUrl)
      .then((response) => response.json())
      .then((data) => {
        setProducts(data);
      })
       .catch((error) => console.error('Error fetching products:', error));
    setWishlistItems(sampleProducts);
  }, []);

  // add items
  const addToWishlist = (item) => {
    setWishlistItems([...wishlistItems, item]);
  };

  //remove items
  const removeFromWishlist = (itemId) => {
    const updatedWishlist = wishlistItems.filter((item) => item.id !== itemId);
    setWishlistItems(updatedWishlist);
  };

  return (
    <div>
      <h2>Wishlist</h2>
      <ul>
        {wishlistItems.map((item) => (
          <li key={item.id}>
            {item.name} - ${item.price}
            {/* Use different buttons for adding and removing items */}
            <button className="add-button" onClick={() => addToWishlist(item)}>
              Add to Wishlist
            </button>
            <button className="remove-button" onClick={() => removeFromWishlist(item.id)}>
              Remove from Wishlist
            </button>
          </li>
        ))}
      </ul>
    </div>
  );
};

export default Wishlist;
