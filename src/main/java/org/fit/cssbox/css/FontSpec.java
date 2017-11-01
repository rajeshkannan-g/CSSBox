/*
 * FontSpec.java
 * Copyright (c) 2005-2017 Radek Burget
 *
 * CSSBox is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *  
 * CSSBox is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 *  
 * You should have received a copy of the GNU Lesser General Public License
 * along with CSSBox. If not, see <http://www.gnu.org/licenses/>.
 *
 * Created on 1. 11. 2017, 16:20:52 by burgetr
 */
package org.fit.cssbox.css;

import cz.vutbr.web.css.CSSProperty;
import cz.vutbr.web.css.CSSProperty.FontStyle;
import cz.vutbr.web.css.CSSProperty.FontWeight;

/**
 * A font specification used as the key in the font table.
 * 
 * @author burgetr
 */
public class FontSpec
{
    private String family;
    private CSSProperty.FontWeight weight;
    private CSSProperty.FontStyle style;
    
    public FontSpec(String family, FontWeight weight, FontStyle style)
    {
        this.family = family;
        this.weight = weight;
        this.style = style;
    }

    public String getFamily()
    {
        return family;
    }

    public void setFamily(String family)
    {
        this.family = family;
    }

    public CSSProperty.FontWeight getWeight()
    {
        return weight;
    }

    public void setWeight(CSSProperty.FontWeight weight)
    {
        this.weight = weight;
    }

    public CSSProperty.FontStyle getStyle()
    {
        return style;
    }

    public void setStyle(CSSProperty.FontStyle style)
    {
        this.style = style;
    }

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((family == null) ? 0 : family.toLowerCase().hashCode());
        result = prime * result + ((style == null) ? 0 : style.hashCode());
        result = prime * result + ((weight == null) ? 0 : weight.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        FontSpec other = (FontSpec) obj;
        if (family == null)
        {
            if (other.family != null) return false;
        }
        else if (!family.toLowerCase().equals(other.family.toLowerCase())) return false;
        if (style != other.style) return false;
        if (weight != other.weight) return false;
        return true;
    }
    
}
