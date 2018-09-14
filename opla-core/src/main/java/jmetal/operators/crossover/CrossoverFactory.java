//  CrossoverFactory.java
//
//  Author:
//       Antonio J. Nebro <antonio@lcc.uma.es>
//       Juan J. Durillo <durillo@lcc.uma.es>
//
//  Copyright (c) 2011 Antonio J. Nebro, Juan J. Durillo
//
//  This program is free software: you can redistribute it and/or modify
//  it under the terms of the GNU Lesser General Public License as published by
//  the Free Software Foundation, either version 3 of the License, or
//  (at your option) any later version.
//
//  This program is distributed in the hope that it will be useful,
//  but WITHOUT ANY WARRANTY; without even the implied warranty of
//  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
//  GNU Lesser General Public License for more details.
// 
//  You should have received a copy of the GNU Lesser General Public License
//  along with this program.  If not, see <http://www.gnu.org/licenses/>.

package jmetal.operators.crossover;


import jmetal.util.Configuration;
import jmetal.util.JMException;

import java.util.HashMap;


/**
 * Class implementing a factory for crossover operators.
 */
public class CrossoverFactory {

    /**
     * Gets a crossover operator through its name.
     *
     * @param name Name of the operator
     * @return The operator
     */


    public static Crossover getCrossoverOperator(String name, HashMap parameters) throws JMException {
//        System.out.println("CORE");
//        if (name.equalsIgnoreCase("PLACrossover"))
//            return new PLACrossover2(parameters);
        System.out.println("------------------> CORE  " + name);
        if (name != null && !name.equals("")) {
            System.out.println("é aqui");
            return new PLAComplementaryCrossover(parameters);
        } else {
            Configuration.logger_.severe("CrossoverFactory.getCrossoverOperator. " +
                    "Operator '" + name + "' not found ");
            throw new JMException("Exception in " + name + ".getCrossoverOperator()");
        }
    }
}
