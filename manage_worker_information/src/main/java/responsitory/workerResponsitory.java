/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsitory;

import DataAccess.WorkerDao;
import java.util.ArrayList;
import model.History;
import model.Worker;

/**
 *
 * @author Bravo
 */
public class workerResponsitory implements IworkerResponsitory {
    private WorkerDao run = new WorkerDao();
    private History history;
    @Override
    public void addWorker() {
        run.addWorker();
    }

    @Override
    public void UpSalary() {
        run.changeSalary();
    }

    @Override
    public void Downsalary() {
        run.changeSalary();
    }

    @Override
    public void DisPlay() {
        run.printListHistory();
    }
    
}
