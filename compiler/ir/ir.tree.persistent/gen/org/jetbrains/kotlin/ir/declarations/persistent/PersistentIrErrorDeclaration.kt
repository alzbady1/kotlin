/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.ir.declarations.persistent

import org.jetbrains.kotlin.descriptors.DeclarationDescriptor
import org.jetbrains.kotlin.ir.ObsoleteDescriptorBasedAPI
import org.jetbrains.kotlin.ir.declarations.IrDeclarationOrigin
import org.jetbrains.kotlin.ir.declarations.IrDeclarationParent
import org.jetbrains.kotlin.ir.declarations.IrErrorDeclaration
import org.jetbrains.kotlin.ir.declarations.persistent.carriers.Carrier
import org.jetbrains.kotlin.ir.declarations.persistent.carriers.ErrorDeclarationCarrier
import org.jetbrains.kotlin.ir.descriptors.toIrBasedDescriptor
import org.jetbrains.kotlin.ir.expressions.IrConstructorCall
import org.jetbrains.kotlin.ir.util.IdSignature

// Auto-generated by compiler/ir/ir.tree.persistent/generator/src/org/jetbrains/kotlin/ir/persistentIrGenerator/Main.kt. DO NOT EDIT!

@OptIn(ObsoleteDescriptorBasedAPI::class)
internal class PersistentIrErrorDeclaration(
    override val startOffset: Int,
    override val endOffset: Int,
    private val _descriptor: DeclarationDescriptor?,
    override val factory: PersistentIrFactory
) : IrErrorDeclaration(),
    PersistentIrDeclarationBase<ErrorDeclarationCarrier>,
    ErrorDeclarationCarrier {
    override val descriptor: DeclarationDescriptor
        get() = _descriptor ?: this.toIrBasedDescriptor()

    override var signature: IdSignature? = factory.currentSignature(this)

    override var lastModified: Int = factory.stageController.currentStage
    override var loweredUpTo: Int = factory.stageController.currentStage
    override var values: Array<Carrier>? = null
    override val createdOn: Int = factory.stageController.currentStage

    override var parentField: IrDeclarationParent? = null
    override var originField: IrDeclarationOrigin = IrDeclarationOrigin.DEFINED
    override var removedOn: Int = Int.MAX_VALUE
    override var annotationsField: List<IrConstructorCall> = emptyList()

    override var origin: IrDeclarationOrigin
        get() = super.origin
        set(value) {
            super.origin = value
        }

    override var parent: IrDeclarationParent
        get() = super.parent
        set(value) {
            super.parent = value
        }

    override var annotations: List<IrConstructorCall>
        get() = super.annotations
        set(value) {
            super.annotations = value
        }
}
