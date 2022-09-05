package com.jnt.echarts.options;

import com.jnt.echarts.options.code.GraphicType;
import com.jnt.echarts.options.style.GraphicStyle;

public class Graphic extends Basic<Graphic> implements Component {
    private GraphicType type;
    private Object shape;
    private GraphicStyle style;
    private String id;
    private String $action;
    private String bouding;
    private String onclick;
    private Boolean silent;
    private Boolean draggable;
    private Boolean invisible;

    public GraphicType type() { return this.type; }

    public Graphic type(GraphicType type) {
        this.type = type;
        return this;
    }

    public Object shape() { return this.shape; }

    public Graphic shape(Object shape) {
        this.shape = shape;
        return this;
    }

    public GraphicStyle style() { return this.style; }

    public Graphic style(GraphicStyle style) {
        this.style = style;
        return this;
    }

    public String id() { return this.id; }

    public Graphic id(String id) {
        this.id = id;
        return this;
    }

    public String $action() { return this.$action; }

    public Graphic $action(String $action) {
        this.$action = $action;
        return this;
    }

    public String bouding() { return this.bouding; }

    public Graphic bouding(String bouding) {
        this.bouding = bouding;
        return this;
    }

    public String onclick() { return this.onclick; }

    public Graphic onclick(String onclick) {
        this.onclick = onclick;
        return this;
    }

    public Boolean silent() { return this.silent; }

    public Graphic silent(Boolean silent) {
        this.silent = silent;
        return this;
    }

    public Boolean draggable() { return this.draggable; }

    public Graphic draggable(Boolean draggable) {
        this.draggable = draggable;
        return this;
    }

    public Boolean invisible() { return this.invisible; }

    public Graphic invisible(Boolean invisible) {
        this.invisible = invisible;
        return this;
    }
}
