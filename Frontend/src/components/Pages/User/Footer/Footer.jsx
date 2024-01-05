import React from 'react';
import { Container } from 'react-bootstrap';
import './Footer.css'
const Footer = () => {
  return (
    <div className="footer" >
      <footer className="bg-black text-light mt-5 py-3">
        <div className="d-flex justify-content-between align-items-center">
          <p className="mb-0">&copy; 2023 Your Company</p>
          <div>
            <a href="#privacy-policy" className="text-light me-3">Privacy Policy</a>
            <a href="#terms-of-service" className="text-light">Terms of Service</a>
          </div>
        </div>
      </footer>
    </div>
  );
};

export default Footer;