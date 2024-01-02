import React from 'react';
import { BrowserRouter, Route, Routes } from 'react-router-dom';
import ScreensUserHome from './User/Home/Home.jsx';
import ScreensAdminHome from './Admin/home.jsx'
import NotFoundPage from './NotFoundPage/home.jsx'
const ScreensRoot = () => (
  <BrowserRouter>
    <Routes>
      <Route path="/" element={<ScreensUserHome />} />
      <Route path="/admin" element={<ScreensAdminHome />} />
      <Route path="*" element={<NotFoundPage />} />
    </Routes>
  </BrowserRouter>
);

export default ScreensRoot;