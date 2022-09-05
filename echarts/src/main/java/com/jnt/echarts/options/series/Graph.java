package com.jnt.echarts.options.series;

import com.jnt.echarts.options.code.Layout;
import com.jnt.echarts.options.code.Roam;
import com.jnt.echarts.options.code.SeriesType;
import com.jnt.echarts.options.code.Symbol;
import com.jnt.echarts.options.series.force.Category;
import com.jnt.echarts.options.series.force.Link;
import com.jnt.echarts.options.series.force.Node;
import com.jnt.echarts.options.series.other.Force;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SuppressWarnings("unchecked")
public class Graph extends Series<Graph> {
    private List nodes;
    private List<Category> categories;
    private List<Link> links;
    private List<Link> edges;
    private Layout layout;
    private Object center;
    private Object size;
    private Object linkSymbol;
    private Object roam;
    private Object coolDown;
    private Force force;
    private Integer minRadius;
    private Integer maxRadius;
    private Integer linkSymbolSize;
    private Integer steps;
    private Double scaling;
    private Double gravity;
    private Double nodeScaleRatio;
    private Boolean large;
    private Boolean draggable;
    private Boolean preventOverlap;
    private Boolean ratioScaling;
    private Boolean useWorker;

    public Graph() { this.type(SeriesType.graph); }

    public Graph(String name) {
        super(name);
        this.type(SeriesType.graph);
    }

    public Graph(String name, Layout layout) {
        super(name);
        this.type(SeriesType.graph);
        this.layout = layout;
    }

    public List<Node> nodes() {
        if (this.nodes == null) this.nodes = new ArrayList();
        return this.nodes;
    }

    public Graph nodes(List nodes) {
        this.nodes = nodes;
        return this;
    }

    public Graph nodes(Node... values) {
        if (values == null || values.length == 0) return this;
        this.nodes().addAll(Arrays.asList(values));
        return this;
    }

    public List<Category> categories() {
        if (this.categories == null) this.categories = new ArrayList<>();
        return this.categories;
    }

    public Graph categories(List<Category> categories) {
        this.categories = categories;
        return this;
    }

    public Graph categories(Category... values) {
        if (values == null || values.length == 0) return this;
        this.categories().addAll(Arrays.asList(values));
        return this;
    }

    public Graph categories(String... names) {
        if (names == null || names.length == 0) return this;
        for (String name : names) { this.categories().add(new Category(name)); }
        return this;
    }

    public Graph categories(Object... values) {
        if (values == null || values.length == 0) return this;
        for (Object value : values) {
            if (value instanceof String) this.categories().add(new Category((String) value));
            else if (value instanceof Category) this.categories().add((Category) value);
        }
        return this;
    }

    public List<Link> links() {
        if (this.links == null) this.links = new ArrayList<>();
        return this.links;
    }

    public Graph links(List<Link> links) {
        this.links = links;
        return this;
    }

    public Graph links(Link... values) {
        if (values == null || values.length == 0) return this;
        this.links().addAll(Arrays.asList(values));
        return this;
    }

    public List<Link> edges() {
        if (this.edges == null) this.edges = new ArrayList<Link>();
        return this.edges;
    }

    public Graph edges(List<Link> edges) {
        this.edges = edges;
        return this;
    }

    public Graph edges(Link... values) {
        if (values == null || values.length == 0) return this;
        this.edges().addAll(Arrays.asList(values));
        return this;
    }

    public Layout layout() { return this.layout; }

    public Graph layout(Layout layout) {
        this.layout = layout;
        return this;
    }

    public Object center() { return this.center; }

    public Graph center(Object center) {
        this.center = center;
        return this;
    }

    public Object size() { return this.size; }

    public Graph size(Object size) {
        this.size = size;
        return this;
    }

    public Object linkSymbol() { return this.linkSymbol; }

    public Graph linkSymbol(Symbol linkSymbol) {
        this.linkSymbol = linkSymbol;
        return this;
    }

    public Graph linkSymbol(String linkSymbol) {
        this.linkSymbol = linkSymbol;
        return this;
    }

    public Object roam() { return this.roam; }

    public Graph roam(Roam roam) {
        this.roam = roam;
        return this;
    }

    public Graph roam(Boolean roam) {
        this.roam = roam;
        return this;
    }

    public Object coolDown() { return this.coolDown; }

    public Graph coolDown(Object coolDown) {
        this.coolDown = coolDown;
        return this;
    }

    public Force force() {
        if (this.force == null) this.force = new Force();
        return this.force;
    }

    public Graph force(Force force) {
        this.force = force;
        return this;
    }

    public Integer minRadius() { return this.minRadius; }

    public Graph minRadius(Integer minRadius) {
        this.minRadius = minRadius;
        return this;
    }

    public Integer maxRadius() { return this.maxRadius; }

    public Graph maxRadius(Integer maxRadius) {
        this.maxRadius = maxRadius;
        return this;
    }

    public Integer linkSymbolSize() { return this.linkSymbolSize; }

    public Graph linkSymbolSize(Integer linkSymbolSize) {
        this.linkSymbolSize = linkSymbolSize;
        return this;
    }

    public Integer steps() { return this.steps; }

    public Graph steps(Integer steps) {
        this.steps = steps;
        return this;
    }

    public Double scaling() { return this.scaling; }

    public Graph scaling(Double scaling) {
        this.scaling = scaling;
        return this;
    }

    public Double gravity() { return this.gravity; }

    public Graph gravity(Double gravity) {
        this.gravity = gravity;
        return this;
    }

    public Double nodeScaleRatio() { return this.nodeScaleRatio; }

    public Graph nodeScaleRatio(Double nodeScaleRatio) {
        this.nodeScaleRatio = nodeScaleRatio;
        return this;
    }

    public Boolean large() { return this.large; }

    public Graph large(Boolean large) {
        this.large = large;
        return this;
    }

    public Boolean draggable() { return this.draggable; }

    public Graph draggable(Boolean draggable) {
        this.draggable = draggable;
        return this;
    }

    public Boolean preventOverlap() { return this.preventOverlap; }

    public Graph preventOverlap(Boolean preventOverlap) {
        this.preventOverlap = preventOverlap;
        return this;
    }

    public Boolean ratioScaling() { return this.ratioScaling; }

    public Graph ratioScaling(Boolean ratioScaling) {
        this.ratioScaling = ratioScaling;
        return this;
    }

    public Boolean useWorker() { return this.useWorker; }

    public Graph useWorker(Boolean useWorker) {
        this.useWorker = useWorker;
        return this;
    }
}
