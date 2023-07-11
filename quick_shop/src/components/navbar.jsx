import React from "react";
import { Link } from "react-router-dom";
import { ShoppingCart } from "phosphor-react";
import "./navbar.css";

export const Navbar = () => {
  return (
    <div className="navbar">
    <h1 className ="name">Shoppers Stop</h1>
      <div className="pages">
      
        <Link to="/"> Shop </Link>
        <Link to="/contact"> Contact </Link>
        
      </div>
    </div>
  );
};
