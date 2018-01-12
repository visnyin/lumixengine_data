vec4 v_tc0 	: TEXCOORD0 = vec4(0.0, 0.0, 0.0, 0.0);
vec4 v_tc1 	: TEXCOORD1 = vec4(0.0, 0.0, 0.0, 0.0);
vec4 v_tc2 	: TEXCOORD2 = vec4(0.0, 0.0, 0.0, 0.0);
vec4 v_tc3 	: TEXCOORD3 = vec4(0.0, 0.0, 0.0, 0.0);
vec4 v_tc4 	: TEXCOORD4 = vec4(0.0, 0.0, 0.0, 0.0);


vec2 v_texcoord0 	: TEXCOORD0 = vec2(0.0, 0.0);
vec3 v_wpos      		: TEXCOORD1 = vec3(0.0, 0.0, 0.0);
vec3 v_view      		: TEXCOORD2 = vec3(0.0, 0.0, 0.0);
vec2 v_texcoord1 	: TEXCOORD3 = vec2(0.0, 0.0);
vec3 v_normal    		: NORMAL    = vec3(0.0, 0.0, 1.0);
vec3 v_tangent   	: TANGENT   = vec3(1.0, 0.0, 0.0);
vec3 v_bitangent 	: BINORMAL  = vec3(0.0, 1.0, 0.0);
vec3 v_common 		: TEXCOORD4  = vec3(0.0, 1.0, 0.0);
vec3 v_tangent_view_pos	: TEXCOORD4 = vec3(0.0, 0.0, 0.0);
vec4 v_common2 	: TEXCOORD5 = vec4(0.0, 0.0, 0.0, 0.0);
vec4 v_pos_radius 	: TEXCOORD6 = vec4(0.0, 0.0, 0.0, 0.0);
vec4 v_color_attn 	: TEXCOORD7 = vec4(0.0, 0.0, 0.0, 0.0);
vec4 v_dir_fov 		: TEXCOORD3 = vec4(0.0, 0.0, 0.0, 0.0);
vec4 v_specular	 	: TEXCOORD4 = vec4(0.0, 0.0, 0.0, 0.0);
vec4 v_color 			: COLOR0 = vec4(1.0, 1.0, 1.0, 1.0);

vec3 a_position  		: POSITION;
vec4 a_color     		: COLOR0;
vec4 a_color0     		: COLOR0;
vec4 a_normal			: NORMAL;
vec4 a_tangent		: TANGENT;
vec2 a_texcoord0	: TEXCOORD0;
vec4 a_weight			: BLENDWEIGHT;
ivec4 a_indices		: BLENDINDICES;

vec4 i_data0     : TEXCOORD7;
vec4 i_data1     : TEXCOORD6;
vec4 i_data2     : TEXCOORD5;
vec4 i_data3     : TEXCOORD4;
vec4 i_data4     : TEXCOORD3;
vec4 i_data5     : TEXCOORD2;
vec4 i_data6     : TEXCOORD1;
vec4 i_data7     : TEXCOORD0;
