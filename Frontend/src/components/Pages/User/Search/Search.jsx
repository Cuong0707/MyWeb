import React from 'react';
import './Search.css'
import SearchItem from '../../../UI/Card/SearchItem';
const Search = () => {
  return (
    <div className='search'>
        <div className='search-info'>
          <SearchItem/>
        </div>
        <div className='search-item'>

        </div>
    </div>
  );
};

export default Search;