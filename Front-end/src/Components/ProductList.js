import { useState } from 'react';
import OrderForm from './OrderForm';

const ProductList = ({ products }) => {
  const [selectedProduct, setSelectedProduct] = useState(null);

  return (
    <>
      <div className='row'>
        {products.map(product => (
          <div className='col-lg-4 col-md-6 col-sm-12 mb-4' key={product.id}>
            <div className='card h-100'>
              <img src={product.imageUrl} className='card-img-top' alt={product.name} />
              <div className='card-body'>
                <h5 className='card-title'>{product.name}</h5>
                <p className='card-text'>{product.description}</p>
                <p className='card-text'><strong>${product.price}</strong></p>
                <button 
                  className="btn btn-primary w-100"
                  onClick={() => setSelectedProduct(product)}
                >
                  Buy
                </button>
              </div>
            </div>
          </div>
        ))}
      </div>

      {selectedProduct && (
        <OrderForm
          product={selectedProduct}
          onClose={() => setSelectedProduct(null)}
        />
      )}
    </>
  );
};

export default ProductList;
