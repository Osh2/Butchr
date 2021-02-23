import './App.css';
import ButchrContainer from './containers/ButchrContainer';
import LoginPage from './components/LoginPage'
import {useState} from 'react'

function App() {

  const [user, setUser] = useState([]);

  const renderButchrContainer = () => {
    if(user.length != 0 && user.name !="NULL"){
    return <ButchrContainer user = {user}/> }
  }

  const renderLoginPage = () => {
    if(user.length === 0 || user.name === "NULL"){
      return <LoginPage user={user} setUser={setUser}/>
    }
  }

  console.log(user);
  
  return (
    <div >
   <div className="header">
            <h2> B U T C H R </h2>
    </div>
      {renderLoginPage()}
      {renderButchrContainer()}
    </div>
  );
}

export default App;
