import React from 'react';

const orders = [
  { id: 1, product: 'Product A', price: 20.99, quantity: 2, date: '2023-07-04' },
  { id: 2, product: 'Product B', price: 15.49, quantity: 3, date: '2023-07-03' },
  { id: 3, product: 'Product C', price: 8.75, quantity: 1, date: '2023-07-02' },
  // Add more orders as needed
];

function OrderView() {
  return (
    <div>
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
