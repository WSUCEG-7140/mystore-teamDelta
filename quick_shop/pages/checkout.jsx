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

import { ToastContainer ,toast} from 'react-toastify';

const Input = (props) => (
  <div className="input">
    <label>{props.label}</label>
    <div className="input-field">
      <input type={props.type} name={props.name} />
      
    </div>
  </div>
);

const Button = (props) => (
  <button className="checkout-btn" type="button" onClick={sayHello}>{props.text}</button>
);


function sayHello() {
  alert('Order Placed and Order Details Saved in DB!');

  
  
}

export const Checkout = (props)=> {

  const location = useLocation();
  const navigate = useNavigate();
  
  const [products,setProducts] = useState(location.state.products)
  
  const  cartItems = location.state.cartItems
  return (
    <div className="checkout">
    <div className="checkout-container">
     <h3 className="heading-3">Credit card checkout</h3>
     <Input label="Cardholder's Name" type="text" name="name" />
     <Input label="Card Number" type="number" name="card_number" imgSrc="https://seeklogo.com/images/V/visa-logo-6F4057663D-seeklogo.com.png" />
      <div className="row">
        <div className="col">
          <Input label="Expiration Date" type="month" name="exp_date" />
        </div>
        <div className="col">
          <Input label="CVV" type="number" name="cvv" />
        </div>
      </div>
      <button className="checkout-btn" type="button" onClick={() => {
              //sayHello();
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
        {
          products?.map((product) => {
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


