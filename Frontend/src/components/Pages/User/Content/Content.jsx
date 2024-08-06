import React from 'react'
import './Content.css'
import Show from './Slideshow/Slideshow'
const Content = () => {
  return (
      <div className='content'>
        <div className='column-1'>
          <div className='title-item'>
            <div className='item'>HUYNH NHAT CUONG</div>
          </div>
          <div className='subtitle-item'>Giới thiệu bản thân: 
            Huỳnh Nhật Cường
            24 Tuổi
          </div>
        </div>
        <div className='column-2'>
            <Show/>
        </div>
      </div>
  );
};

export default Content;