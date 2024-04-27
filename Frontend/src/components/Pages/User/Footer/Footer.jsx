import React from 'react';
import './Footer.css'
const Footer = () => {
  return (
    <div className="footer" >
      <footer>
        <div>
          <p>&copy; 2023 Your Company</p>
          <div>
            <a href="#privacy-policy" >Privacy Policy</a>
            <a href="#terms-of-service" >Terms of Service</a>
          </div>
        </div>
      </footer>
    </div>
  );
};

export default Footer;