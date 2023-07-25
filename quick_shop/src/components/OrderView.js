import React from 'react';
import './OrderView.css'; // Import the CSS file

const orders = [
  // Your order data here
];

function OrderView() {
  return (
    <div className="container"> {/* Apply styles using className */}
      <h1>My Orders</h1>
      <ul>
        {orders.map((order) => (
          <li key={order.id}>
            <p>Order ID: {order.id}</p>
            <p>Product: {order.product}</p>
            <p>Price: ${order.price.toFixed(2)}</p>
            <p>Quantity: {order.quantity}</p>
            <p>Date: {order.date}</p>
          </li>
        ))}
      </ul>
    </div>
  );
}

export default OrderView;
