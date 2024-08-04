import React from 'react'
import "./Header.css"
// import img from '../../../../assets/avt.jpg'
const Header = () => {
  return (
    
      <header className="main-header">
        <nav className="menu-bara">
          <ul>
            <li><a href="/">Home</a></li>
            <li><a href="/">About</a></li>
            <li><a href="/">Services</a></li>
            <li><a href="/">Contact</a></li>
          </ul>
        </nav>
        <nav className='menu-bara'><h5>GreenTech Essentials</h5><h7>Choose Eco-Friendly Technology, Secure the Future</h7></nav>
        <nav className="menu-bara">
          <ul>
            <li><a href="/">Home</a></li>
            <li><a href="/">About</a></li>
            <li><a href="/">Services</a></li>
            <li><a href="/">Contact</a></li>
          </ul>
        </nav>
    </header>
    
  );
};

export default Header;