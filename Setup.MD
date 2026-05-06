# Registry Manager

A lightweight command-line tool to **create** and **delete** named registries with ease.

---

## Getting Started

### Clone the Repository

```bash
git clone <repo-url>
cd <repo-directory>
```

---

## Usage

Run the tool using `python main.py` with the following arguments:

| Argument   | Description                          | Values              |
|------------|--------------------------------------|---------------------|
| `--action` | The operation to perform             | `create` / `delete` |
| `--name`   | The name of the registry to act upon | Any string          |

---

## Create a Registry

Initialise a new registry by providing an action of `create` and a name:

```bash
python main.py --action create --name <registry-name>
```

**Example:**

```bash
python main.py --action create --name my-registry
```

---

## Delete a Registry

> **Note:** Existing registries can be permanently deleted. This action cannot be undone.

Remove an existing registry by providing an action of `delete` and the registry name:

```bash
python main.py --action delete --name <registry-name>
```

**Example:**

```bash
python main.py --action delete --name my-registry
```

---

## Quick Reference

```bash
# Clone the repo
git clone <repo-url>

# Create a registry
python main.py --action create --name <registry-name>

# Delete a registry
python main.py --action delete --name <registry-name>
```

---

## Important Notes

- Deleting a registry is **irreversible** — double-check the name before running a delete action.
- Ensure you have the required dependencies installed before running `main.py`.

---

## Contributing

Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

---

## License

This project is licensed under the [MIT License](LICENSE).
