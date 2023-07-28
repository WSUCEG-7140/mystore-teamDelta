// Import the React and ReactDOM libraries
import React from 'react';
import ReactDOM from 'react-dom';
import App from './App'; // Import the App component from the './App' file

// This is a test case using the Jest testing framework
// It checks if the App component renders without crashing
it('renders without crashing', () => {
  // Create a new 'div' element to act as a container for rendering the App component
  const div = document.createElement('div');
  ReactDOM.render(<App />, div); // Render the App component inside the 'div' container
});
