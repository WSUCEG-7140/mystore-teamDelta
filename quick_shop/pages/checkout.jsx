// Import required modules and components
import React from 'react';
import './checkout.module.css';
import {CheckoutItem} from "./checkout-item"
import { useState } from 'react';
import {CartItem} from ".././pages/cart/cart-item";
import { ShopContext } from ".././context/shop-context";
import { useContext } from 'react';
import {Cart} from './cart/cart';
import {PRODUCTS} from '../products';
import { useLocation,useNavigate } from 'react-router-dom';

// Importing a toast component from 'react-toastify'
import { ToastContainer ,toast} from 'react-toastify';

// Input component to handle input fields
const Input = (props) => (
  <div className="input">
    <label>{props.label}</label>
    <div className="input-field">
      <input type={props.type} name={props.name} />
      
    </div>
  </div>
);

// Button component with a click event to sayHello
const Button = (props) => (
  <button className="checkout-btn" type="button" onClick={sayHello}>{props.text}</button>
);

// Function to show an alert when the button is clicked
function sayHello() {
  alert('Order Placed and Order Details Saved in DB!');

  
  
}

// Checkout component
//see [Issue#49] (https://github.com/WSUCEG-7140/mystore-teamDelta/issues/49)
export const Checkout = (props)=> {

  // Accessing the current location and navigation from 'react-router-dom'
  const location = useLocation();
  const navigate = useNavigate();

  // Setting up state variables
  const [products,setProducts] = useState(location.state.products)
  
  const  cartItems = location.state.cartItems
  return (
    <div className="checkout">
    <div className="checkout-container">
     <h3 className="heading-3">Credit card checkout</h3>
     {/* Input fields for cardholder's name and card number */}
     <Input label="Cardholder's Name" type="text" name="name" />
     <Input label="Card Number" type="number" name="card_number" imgSrc="https://seeklogo.com/images/V/visa-logo-6F4057663D-seeklogo.com.png" />
      <div className="row">
        <div className="col">
          {/* Input field for the expiration date */}
          <Input label="Expiration Date" type="month" name="exp_date" />
        </div>
        <div className="col">
          {/* Input field for the CVV */}
          <Input label="CVV" type="number" name="cvv" />
        </div>
      </div>
      {/* Button to place the order with a toast notification */}
      <button className="checkout-btn" type="button" onClick={() => 
              // Calling the sayHello function on button click
              //sayHello();
              // Displaying a toast success notification
              toast.success('Regitered !', {
        position:'top-center',
        autoClose:5000
 });
            }}>Place Order</button>
    </div>
    <div>
        <h1>Your Cart Items</h1>
      </div>
      <div className="cart">
        {/* Mapping through the products and rendering the CheckoutItem component for each cart item */}
        {
          products?.map((product) => {
            // Checking if the cart item for this product is not 0
            if (cartItems[product.id] !== 0) {
              const prps = {product: product,cartItems: cartItems};
            return <CheckoutItem data={prps} />;
          }         
        })
        }
      </div>
 </div>
  );  
}


