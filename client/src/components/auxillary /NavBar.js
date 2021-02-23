import {Link} from "react-router-dom"

const NavBar = function (){
    return(
        <div id="navBar">
            <Link to="/" className="nav-items">Home</Link>
            <Link to="/meat" className="nav-items"> Fresh Cuts </Link>
            <Link to="/processed" className="nav-items"> Processed Products </Link>
            <Link to="/nonfood" className="nav-items"> Utensils and Equipment  </Link>
            <Link to="/basket" className="nav-items"> Basket  </Link>

        </div>
    )
}

export default NavBar;