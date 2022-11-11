#shader vertex(vec2 position, vec4 color)

void main() {
    pixel.color = color;
}

#shader pixel(vec4 color)

void main() {
    outColor = color;
}
