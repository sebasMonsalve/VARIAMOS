package com.variamos.refas.core.sematicsmetamodel;

import java.util.ArrayList;
import java.util.List;

import com.variamos.refas.core.types.DirectRelationType;
import com.variamos.syntaxsupport.metametamodel.SemanticAttribute;
import com.variamos.syntaxsupport.semanticinterface.IntDirectRelationType;
import com.variamos.syntaxsupport.semanticinterface.IntDirectSemanticRelation;

/**
 * @author Juan Carlos Mu�oz 2014 part of the PhD work at CRI - Universite Paris
 *         1
 *
 *         Definition of semantics for REFAS
 */
public class DirectSemanticRelation extends AbstractSemanticRelation implements
		IntDirectSemanticRelation {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7976788205587295216L;
	private String identifier;
	private boolean exclusive;
	private List<IntDirectRelationType> semanticRelationTypes;

	public DirectSemanticRelation() {
		super();
	}

	public DirectSemanticRelation(Boolean toSoftSemanticRelation,
			String identifier, boolean exclusive,
			List<IntDirectRelationType> semanticRelationTypes) {
		super(toSoftSemanticRelation);
		this.identifier = identifier;
		this.exclusive = exclusive;
		this.semanticRelationTypes = semanticRelationTypes;
	}

	public DirectSemanticRelation(String identifier, boolean exclusive,
			List<IntDirectRelationType> semanticRelationTypes) {
		super(false);
		this.identifier = identifier;
		this.exclusive = exclusive;
		this.semanticRelationTypes = semanticRelationTypes;
	}
	
	public DirectSemanticRelation(String identifier, boolean exclusive,
			List<IntDirectRelationType> semanticRelationTypes,
			boolean toSoftSemanticConcept,
			List<AbstractSemanticConcept> conflicts,
			List<AbstractSemanticConcept> alwaysAllows) {
		super(toSoftSemanticConcept, conflicts, alwaysAllows);
		this.identifier = identifier;
		this.exclusive = exclusive;
		this.semanticRelationTypes = semanticRelationTypes;
	}

	public DirectSemanticRelation(String identifier, boolean exclusive,
			List<IntDirectRelationType> semanticRelationTypes,
			boolean toSoftSemanticConcept) {
		super(toSoftSemanticConcept);
		this.identifier = identifier;
		this.exclusive = exclusive;
		this.semanticRelationTypes = semanticRelationTypes;
	}

	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public boolean isExclusive() {
		return exclusive;
	}

	public void setExclusive(boolean exclusive) {
		this.exclusive = exclusive;
	}

	public List<IntDirectRelationType> getSemanticRelationTypes() {
		return semanticRelationTypes;
	}

	public void setSemanticRelationTypes(
			List<IntDirectRelationType> semanticRelationTypes) {
		this.semanticRelationTypes = semanticRelationTypes;
	}


}
