import React from 'react';
import { Container, Row, Col } from 'react-bootstrap';
import './Home.css'
import Header from '../../../components/Pages/User/Header/Header.jsx';
import Content from '../../../components/Pages/User/Content/Content.jsx';
import Aside from '../../../components/Pages/User/Aside/Aside.jsx';
import MapAside from '../../../components/Pages/User/Aside/MapAside.jsx';
import Footer from '../../../components/Pages/User/Footer/Footer.jsx';
const Home = () => {
  return (
    <div className='home'>
        <div className='secon'>
          <Header />
          <Container className="">
            <Col md={8} className="">
              <Content />
            </Col>
            <Col md={4}>
              <Aside />
            </Col>
            <MapAside />
            <div className='end'>
              <Footer />
            </div>
          </Container>
        </div>
      
    </div>
  );
};

export default Home;