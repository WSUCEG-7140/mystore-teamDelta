import React, { useState } from 'react';
import './PlaceOrderPage.css'; // Import your CSS file for styling

function PlaceOrderPage({ cartItems }) {
  const [shippingAddress, setShippingAddress] = useState('');
  const [paymentMethod, setPaymentMethod] = useState('PayPal');

  const handlePlaceOrder = () => {
    // Implement the order placement logic here (e.g., handle the backend API call).
    // This is a placeholder and should not be used for actual order placement.
    console.log('Order placed successfully.');
  };

  return (
    <div className="place-order-container"> {/* Apply styles using className */}
      <h1>Place Order</h1>
      <div className="order-summary">
        <h2>Order Summary</h2>
        <ul>
          {cartItems.map((item) => (
            <li key={item.id}>
              {item.name} - ${item.price.toFixed(2)}
            </li>
          ))}
        </ul>
        <h3>Total: ${calculateTotal(cartItems).toFixed(2)}</h3>
      </div>
      <div className="shipping-details">
        <h2>Shipping Details</h2>
        <label>Shipping Address:</label>
        <input
          type="text"
          value={shippingAddress}
          onChange={(e) => setShippingAddress(e.target.value)}
          placeholder="Enter your shipping address"
        />
        <label>Payment Method:</label>
        <select value={paymentMethod} onChange={(e) => setPaymentMethod(e.target.value)}>
          <option value="PayPal">PayPal</option>
          <option value="Credit Card">Credit Card</option>
          {/* Add more payment methods as needed */}
        </select>
      </div>
      <button onClick={handlePlaceOrder}>Place Order</button>
    </div>
  );
}

export default PlaceOrderPage;

// Helper function to calculate the total price of cart items
const calculateTotal = (cartItems) => {
  return cartItems.reduce((total, item) => total + item.price, 0);
};
