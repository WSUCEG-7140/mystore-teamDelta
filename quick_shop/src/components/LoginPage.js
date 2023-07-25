import React, { useState } from 'react';
import './LoginPage.css'; // Import your CSS file for styling

function LoginPage() {
  const [email, setEmail] = useState('');
  const [password, setPassword] = useState('');

  const handleLoginSubmit = (e) => {
    e.preventDefault();
    // Implement login logic here (e.g., check credentials, handle authentication).
    // This is a placeholder and should not be used for actual login functionality.
    console.log('Login is not implemented in this example.');
  };

  return (
    <div className="login-container"> {/* Apply styles using className */}
      <h1>Login</h1>
      <form onSubmit={handleLoginSubmit}>
        <label>Email:</label>
        <input
          type="email"
          value={email}
          onChange={(e) => setEmail(e.target.value)}
          placeholder="Enter your email"
        />

        <label>Password:</label>
        <input
          type="password"
          value={password}
          onChange={(e) => setPassword(e.target.value)}
          placeholder="Enter your password"
        />

        <button type="submit">Login</button>
      </form>
    </div>
  );
}

export default LoginPage;
