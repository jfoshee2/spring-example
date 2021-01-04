import React, { Component } from 'react';
import logo from './logo.svg';
import './App.css';


function App() {
  return (
    <div className="App">
      <header className="App-header">
        <h1 className="login">Login</h1>
        <form>
          <label className="fname">Username:</label>
          <input type="text"></input>
          <br></br>
          <label className="password">Password:</label>
          <input type="text"></input>
        </form>
        <br></br>
        <button className="submit-button">Login</button>
        {/* <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a> */}
      </header>
    </div>
  );
}

export default App;
