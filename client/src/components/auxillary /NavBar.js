import {Link} from "react-router-dom"

const NavBar = function (){
    return(
        <div id="navBar">
            <Link to="/">Home</Link>
            <Link to="/meat"> Fresh Cuts </Link>
            <Link to="/processed"> Processed Products </Link>
            <Link to="/nonfood"> Utensils and Equipment  </Link>
        </div>
    )
}

export default NavBar;