/**
 *
 * $Id$
 */
package edu.kit.sdq.aml_aggregator.validation;

import edu.kit.sdq.aml_aggregator.CAEXContainer;
import edu.kit.sdq.aml_aggregator.ColladaContainer;
import edu.kit.sdq.aml_aggregator.PLCopenContainer;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link edu.kit.sdq.aml_aggregator.AMLProject}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface AMLProjectValidator {
	boolean validate();

	boolean validateName(String value);

	boolean validateCaexcontainer(CAEXContainer value);

	boolean validatePlcopencontainer(EList<PLCopenContainer> value);

	boolean validateColladacontainer(EList<ColladaContainer> value);
}
