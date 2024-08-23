import React from 'react';
import './Home.css'
import Header from '../../../components/Pages/User/Header/Header.jsx';
import Content from '../../../components/Pages/User/Content/Content.jsx';
import Search from '../../../components/Pages/User/Search/Search.jsx';
const Home = ({ activeComponent }) => {
  const renderComponent = () => {
    switch (activeComponent) {
      case 'search':
        return <Search />;
      default:
        return <Content />;
    }
  };
  return (
    <div className='home'>
        <div className='home-content'>
          <Header />
          {renderComponent()}
        </div>
      
    </div>
  );
};

export default Home;