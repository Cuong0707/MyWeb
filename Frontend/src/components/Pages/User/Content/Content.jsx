import React from 'react'
import './Content.css'
import Show from './Slideshow/Slideshow'
const Content = () => {
  return (
      <div className='content'>
        <div className='content-text'>
          <div className='info-item'>
            <div className='title-item'>
              <div className='item'>Moraine Lake Canada</div>
            </div>
            <div className='subtitle-item'>Don't miss a visit to one of Banff's most popular locations, Moraine Lake. This stunning turquoise gem, cradled by the Valley of the Ten Peaks, is a sight straight out of a dream. Take in the iconic views from the lakeshore and the rockpile or explore the area further with trails suitable for both seasoned hikers and casual strollers
            </div>
            <div className='more-info'>
                <button>MORE...</button>
            </div>
          </div>
          <div className='more'>
            <button>Scroll down</button>
          </div>
        </div>
        <div className='content-img'>
            <Show/>
        </div>
      </div>
  );
};

export default Content;