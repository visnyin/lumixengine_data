$input v_wpos, v_texcoord0 // in...

/*
 * Copyright 2011-2015 Branimir Karadzic. All rights reserved.
 * License: http://www.opensource.org/licenses/BSD-2-Clause
 */

#include "common.sh"

SAMPLER2D(u_shadowmap, 0);

void main()
{
	vec4 color = (texture2D(u_shadowmap, v_texcoord0) );

	gl_FragColor.rgb = color.rgb;
	gl_FragColor.w = 1.0;
}