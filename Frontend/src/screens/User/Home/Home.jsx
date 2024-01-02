import React from 'react';
import { Container, Row, Col } from 'react-bootstrap';
import Header from '../../../components/Pages/User/Header/Header.jsx';
import Content from '../../../components/Pages/User/Content/Content.jsx';
import Aside from '../../../components/Pages/User/Aside/Aside.jsx';
import MapAside from '../../../components/Pages/User/Aside/MapAside.jsx';
import Footer from '../../../components/Pages/User/Footer/Footer.jsx';
const Home = () => {
  return (
    <div>
      <Header />
      <Container className="pt-5">
        <Row>
          <Col md={8} className="mx-auto">
            <Content />
          </Col>
          <Col md={4}>
            <Aside/>
          </Col>
        </Row>
        <Row>
          <MapAside/>
        </Row>
        <Row>
          <Footer/>
        </Row>
      </Container>
    </div>
  );
};

export default Home;