import React, { useState } from 'react';
import './PaymentTransaction.css'; // Import your CSS file for styling

function PaymentTransaction() {
  const [cardNumber, setCardNumber] = useState('');
  const [cardName, setCardName] = useState('');
  const [expiryDate, setExpiryDate] = useState('');
  const [cvv, setCvv] = useState('');

  const handlePaymentSubmit = (e) => {
    e.preventDefault();
    // Implement payment processing logic here (e.g., using a payment gateway).
    // This is a placeholder and should not be used for actual payment processing.
    console.log('Payment processing is not implemented in this example.');
  };

  return (
    <div className="payment-container"> {/* Apply styles using className */}
      <h1>Payment Transaction</h1>
      <form onSubmit={handlePaymentSubmit}>
        <label>Card Number:</label>
        <input
          type="text"
          value={cardNumber}
          onChange={(e) => setCardNumber(e.target.value)}
          placeholder="1234 5678 9012 3456"
        />

        <label>Cardholder Name:</label>
        <input
          type="text"
          value={cardName}
          onChange={(e) => setCardName(e.target.value)}
          placeholder="John Doe"
        />

        <div className="expiry-cvv">
          <div>
            <label>Expiry Date:</label>
            <input
              type="text"
              value={expiryDate}
              onChange={(e) => setExpiryDate(e.target.value)}
              placeholder="MM/YY"
            />
          </div>

          <div>
            <label>CVV:</label>
            <input
              type="text"
              value={cvv}
              onChange={(e) => setCvv(e.target.value)}
              placeholder="123"
            />
          </div>
        </div>

        <button type="submit">Submit Payment</button>
      </form>
    </div>
  );
}

export default PaymentTransaction;
