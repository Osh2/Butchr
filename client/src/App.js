import './App.css';
import ButchrContainer from './containers/ButchrContainer';
import LoginPage from './components/LoginPage'
import {useState} from 'react'

function App() {

  const [user, setUser] = useState([]);

  const renderButchrContainer = () => {
    if(user.length != 0){
    return <ButchrContainer /> }
  }

  const renderLoginPage = () => {
    if(user.length === 0){
      return <LoginPage setUser={setUser}/>
    }
  }

  
  return (
    <div >
      {renderLoginPage()}
      {renderButchrContainer()}
    </div>
  );
}

export default App;
