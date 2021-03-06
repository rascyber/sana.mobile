/**
 * Copyright (c) 2013, Sana
 * All rights reserved.
 * <p>
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 * <p>
 * * Redistributions of source code must retain the above copyright
 * notice, this list of conditions and the following disclaimer.
 * * Redistributions in binary form must reproduce the above copyright
 * notice, this list of conditions and the following disclaimer in the
 * documentation and/or other materials provided with the distribution.
 * * Neither the name of the Sana nor the
 * names of its contributors may be used to endorse or promote products
 * derived from this software without specific prior written permission.
 * <p>
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL Sana BE LIABLE FOR ANY DIRECT, INDIRECT,
 * INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT
 * NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 * THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF
 * THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package org.sana.api;

/**
 * Describes the behavior of a lexical unit.
 *
 * @author Sana Development
 *
 */
public interface IConcept extends IModel {

    String NAME_REGEX = "([A-Z])+(([A-Z_])*([A-Z])+)*";

    /**
     * Provides a String representation of any constraints placed upon data this
     * Concept represents.
     *
     * @return A data constraint string.
     */
    String getConstraints();

    /**
     * Provides the class of data that this Concept represents.
     *
     * @return The data class.
     */
    String getDatatype();

    /**
     * Provides the machine friendly, unique name of the Concept formatted
     * according to {@link #NAME_REGEX}
     *
     * @return The machine friendly name.
     */
    String getName();

    /**
     * Provides a human readable display name.
     *
     * @return The display name.
     */
    String getDisplayName();

    /**
     * Provides a longer narrative description String
     *
     * @return The description String.
     */
    String getDescription();


    /**
     * Provides the MIME type of any collected data.
     *
     * @return A mime type String.
     */
    String getMediatype();
}
