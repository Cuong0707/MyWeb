import React, { useState } from 'react'
import './Slideshow.css'
import IMG2 from '../../../../../assets/Img/IMG1.jpg'
import IMG1 from '../../../../../assets/Img/IMG2.jpg'
import IMG3 from '../../../../../assets/Img/IMG3.jpg'
import IMG4 from '../../../../../assets/Img/IMG4.jpg'
import IMG5 from '../../../../../assets/Img/IMG5.jpg'
import IMG6 from '../../../../../assets/Img/IMG6.jpg'
import IMG7 from '../../../../../assets/Img/IMG7.jpg'
const Slideshow = () => {
    const images = [
        IMG1,
        IMG2,
        IMG3,
        IMG4,
        IMG5,
        IMG6,
        IMG7,
    ]
    const [currentIndex, setCurrentIndex] = useState(0);
    const handlePrevious = () => {
        setCurrentIndex((prevIndex) =>
        prevIndex === 0 ? images.length - 1 : prevIndex - 1
    );
    };
    const handleMiddleButton = () => {
        alert("Middle button clicked!");
      };
    const handleNext = () => {
        setCurrentIndex((prevIndex) =>
        prevIndex === images.length - 1 ? 0 : prevIndex + 1
    );
    };
    return (
      <>
        <div className='showslides'>
            <div className='images-container'>
                <img
                    src={images[currentIndex]} 
                    className="reps-img" />
                <img 
                    src={images[(currentIndex + 1) % images.length]}
                    className="reps-img" />
            </div>
            <div className='controls'>
                <button onClick={handlePrevious}>⭠</button>
                <button className="middle-button" onClick={handleMiddleButton}>Ο</button>
                <button onClick={handleNext}>⭢</button>
            </div>
        </div>
        
      </>
  );
};

export default Slideshow;