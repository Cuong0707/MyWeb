import React from 'react';
import './SearchItem.css'
import Button from '../Button/Button';
const SearchItem = () => {
  const handleSearch = (e) =>
  {
    alert("yah")
  };
  return (
    <form onSubmit={handleSearch}>
      <select >
        <option>a</option>
        <option>b</option>
        <option>c</option>
        <Button text="Search"/>
      </select>
    </form>
  );
};

export default SearchItem;