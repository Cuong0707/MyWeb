import React from 'react';
import "./Header.css"
import { Navbar } from 'react-bootstrap';
import img from "../../../../assets/avt.jpg"
const Header = () => {
  return (
    <div>
      <Navbar className="menu-bar">
        <Navbar.Brand className='ms-3' ><img src="http://webcoban.vn/image/flower.gif" alt="" /></Navbar.Brand>
        <a href="/">Trang chủ</a>
        <a href="/">Danh mục</a>
        <a href="/">Liên hệ</a>
      </Navbar>
    </div>
  );
};

export default Header;