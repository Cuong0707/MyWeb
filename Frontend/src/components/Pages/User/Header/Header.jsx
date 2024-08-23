import React from 'react'
import "./Header.css"
const Header = React.memo( () => {
  return (
      <header className="main-header">
        <nav className="menu-bara">
          <ul>
            <li><a href="/">Home</a></li>
            <li><a href="/search">Search</a></li>
            <li><a href="/">Services</a></li>
            <li><a href="/contact">Contact</a></li>
          </ul>
        </nav>
        <nav className='menu-bara'><h5>Travelista</h5><h7>Explore the World with Travelista</h7></nav>
        <nav className="menu-bara">
          <ul>
            <li><a href="/">Home</a></li>
            <li><a href="/">About</a></li>
            <li><a href="/">Services</a></li>
            <li><a href="/login">Login</a></li>
          </ul>
        </nav>
    </header>
    
  );
});

export default Header;