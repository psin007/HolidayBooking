/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jungle.repository;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import jungle.repositories.entities.UserTransaction;

/**
 *
 * @author Pooja
 */
@Stateless
public class JungleRepositoryImpl implements JungleRepository {

    @PersistenceContext
    private EntityManager entityManager;
    
    @Override
    public UserTransaction searchTransactionByNumber(int number) throws Exception {
        UserTransaction transaction = entityManager.find(UserTransaction.class,number);
        return transaction;
    }

    @Override
    public UserTransaction searchTransactionByName(String name) throws Exception {
        UserTransaction transaction = entityManager.find(UserTransaction.class,name);
        return transaction;
    }
    
    @Override
    public List<UserTransaction> getAllTransaction() throws Exception {
        return entityManager.createNamedQuery(UserTransaction.GET_ALL_QUERY_NAME).getResultList();
    }
}
