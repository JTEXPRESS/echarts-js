package com.jnt.echarts.options;

import com.jnt.echarts.options.code.Easing;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public abstract class AbstractData<T> implements Data<T>, java.io.Serializable {
    protected List data;
    private Object animationEasing;
    private Object animationEasingUpdate;
    private Integer animationDuration;
    private Integer animationDurationUpdate;
    private Boolean clickable;
    private Boolean hoverable;
    private Boolean animation;

    public List data() {
        if (this.data == null)  this.data = new ArrayList();
        return this.data;
    }

    @Override
    public T data(Object... values) {
        if (values == null || values.length == 0) return (T) this;
        for (Object value : values) { this.data().add(value); }
        return (T) this;
    }

    public Object animationEasing() { return this.animationEasing; }

    public T animationEasing(Object animationEasing) {
        this.animationEasing = animationEasing;
        return (T) this;
    }

    public T animationEasing(Easing animationEasing) {
        this.animationEasing = animationEasing;
        return (T) this;
    }

    public Object animationEasingUpdate() { return this.animationEasingUpdate; }

    public T animationEasingUpdate(Object animationEasingUpdate) {
        this.animationEasingUpdate = animationEasingUpdate;
        return (T) this;
    }

    public T animationEasingUpdate(Easing animationEasingUpdate) {
        this.animationEasingUpdate = animationEasingUpdate;
        return (T) this;
    }

    public Integer animationDuration() { return this.animationDuration; }

    public T animationDuration(Integer animationDuration) {
        this.animationDuration = animationDuration;
        return (T) this;
    }

    public Integer animationDurationUpdate() { return this.animationDurationUpdate; }

    public T animationDurationUpdate(Integer animationDurationUpdate) {
        this.animationDurationUpdate = animationDurationUpdate;
        return (T) this;
    }

    public Boolean clickable() { return this.clickable; }

    public T clickable(Boolean clickable) {
        this.clickable = clickable;
        return (T) this;
    }

    public Boolean hoverable() { return this.hoverable; }

    public T hoverable(Boolean hoverable) {
        this.hoverable = hoverable;
        return (T) this;
    }

    public Boolean animation() { return this.animation; }

    public T animation(Boolean animation) {
        this.animation = animation;
        return (T) this;
    }
}
