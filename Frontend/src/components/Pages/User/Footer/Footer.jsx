import React from 'react';
import { Container } from 'react-bootstrap';
const Footer = () => {
  return (
    <footer className="bg-dark text-light mt-5 py-3">
      <Container>
        <div className="d-flex justify-content-between align-items-center">
          <p className="mb-0">&copy; 2023 Your Company</p>
          <div>
            <a href="#privacy-policy" className="text-light me-3">Privacy Policy</a>
            <a href="#terms-of-service" className="text-light">Terms of Service</a>
          </div>
        </div>
      </Container>
    </footer>
  );
};

export default Footer;