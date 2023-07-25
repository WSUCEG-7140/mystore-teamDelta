import React from 'react';
import './UserProfile.css'; // Import your CSS file for styling

const user = {
  name: 'John Doe',
  email: 'john.doe@example.com',
  profilePicture: 'https://example.com/profile-picture.jpg', // Replace with the actual URL of the user's profile picture
  // Add more user information as needed
};

function UserProfile() {
  return (
    <div className="profile-container"> {/* Apply styles using className */}
      <img src={user.profilePicture} alt="Profile" className="profile-picture" />
      <h1>{user.name}</h1>
      <p>Email: {user.email}</p>
      {/* Add more user details as needed */}
    </div>
  );
}

export default UserProfile;
