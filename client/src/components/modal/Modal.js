import './Modal.css'

const MODAL_STYLES ={
    position: 'fixed',
    backgroundColor: '#622521',
    padding: '10px',
    
    zIndex: 1000

}

const Modal = ({ open, children, onClose }) => {
    if(!open) return null
    return(
        <div>
            <div style={MODAL_STYLES}>
                <button onClick={onClose}>x</button>
                {children}
            </div>
        </div>
    )
}

export default Modal;