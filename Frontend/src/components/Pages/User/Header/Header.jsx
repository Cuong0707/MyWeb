import React from 'react';
import "./Header.css"
import { Navbar } from 'react-bootstrap';
const Header = () => {
  return (
    <div>
      <Navbar className="menu-bar">
        <Navbar.Brand className='' ><img src="http://webcoban.vn/image/flower.gif" alt="" /></Navbar.Brand>
        <a href="/">Trang chủ</a>
        <a href="/">Danh mục</a>
        <a href="/">Liên hệ</a>
      </Navbar>
    </div>
  );
};

export default Header;