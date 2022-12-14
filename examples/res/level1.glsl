precision highp float;

uniform vec2 u_resolution;
uniform sampler2D u_mainTex; // ../res/images/mario.png

void main() {
  vec2 uv = gl_FragCoord.xy / u_resolution;
  float aspect = u_resolution.x / u_resolution.y;

  // Preserve aspect ratio of the image:
  uv.x *= aspect;
  // Center:
  // uv.x += (1.0 - aspect) / 2.0;
  // Tile:
  // uv = fract(uv);

  vec3 tex = texture2D(u_mainTex, uv).ggr;

  gl_FragColor = vec4(tex, 0.002);
}
