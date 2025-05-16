import React, { useState } from 'react';

const OrderForm = ({ product, onClose }) => {
  const [formData, setFormData] = useState({
    name: '',
    address: '',
    pincode: '',
    phone: '',
    amount: product.price,
  });

  const handleChange = (e) => {
    setFormData({...formData, [e.target.name]: e.target.value});
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    alert('🎉 Congratulations! Your order has been placed successfully.');
    onClose();
  };

  return (
    <div className="modal-background">
      <div className="modal-card">
        <h4>Order for: {product.name}</h4>
        <form onSubmit={handleSubmit}>
          <input name="name" placeholder="Name" onChange={handleChange} required className="form-control mb-2" />
          <input name="address" placeholder="Address" onChange={handleChange} required className="form-control mb-2" />
          <input name="pincode" placeholder="Pincode" onChange={handleChange} required className="form-control mb-2" />
          <input name="phone" placeholder="Phone" onChange={handleChange} required className="form-control mb-2" />
          <input name="amount" value={formData.amount} disabled className="form-control mb-2" />
          <button type="submit" className="btn btn-success w-100">Place Order</button>
          <button type="button" className="btn btn-secondary mt-2 w-100" onClick={onClose}>Cancel</button>
        </form>
      </div>
    </div>
  );
};

export default OrderForm;
